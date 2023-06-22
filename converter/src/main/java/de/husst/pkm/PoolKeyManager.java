/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.husst.pkm;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Smarty
 */
public class PoolKeyManager {

    enum POOL {
        BEWERTUNGSTYP, TARIFPUNKT, SPRACHE, VARIABLE, FUNKTION, AUSNAHME, AUSWAHLDATEN, AUSGANGSDATENFAMILIE,
        ABHÄNGIGKEITSKRITERIUM,
        IDENTIFIKATIONSPARAMETER, IDENTIFIKATIONSPARAMETERWERT_SORTENGRUPPE, EFMPRODUKT, TARIFPRODUKT, FREMDPRODUKT, PRODUKTGRUPPE,
        TARIFPUNKTGRUPPE, LINIE, VERKEHRSMITTELTYP, VERKEHRSMITTELLINIENBEZUG, MODULKONTEXT, BEZAHLART, MITNAHMETYP,
        RABATMEDIENTYP, TAGESBEDINGUNG, TAGESZEITBEDINGUNG, MODULKONTEXTBEDINGUNG, VERKEHRSMITTELLINIENBEDINGUNG,
        ZUORDNUNGSTYP, WEGEVARIANTEN, BEWERTUNGSDATEN, NUMMERNINTERPRETATION, BITLEISTENINTERPRETATION,
        RAUMNUMMERNINTERPRETATION, NACHFOLGERKRITERIUM, SCHLÜSSEL, KONTIGENTIERUNG, WÄHRUNG, ZAHLUNGSINTERVALL,
        SPEZIALBEDINGUNG, BEZAHLARTBEDINGUNG, ZAHLUNGSINTERVALLBEDINGUNG, ZEITRAUMBEDINGUNG, TARIFPUNKTBEDINGUNG,
		BEWERTUNGSBEDINGUNG, MITNAHMEBEDINGUNG, RABATTMEDIENBEDINGUNG, TARIFPUNKTREFERENZ, AUSGANGSKONTEXT,
		DATENTABELLE, EINGANGSSCHNITTSTELLE, AUSGANGSSCHNITTSTELLE, SCHRITT, BIFA_INTERPRETATION, GEOSEGMENTBEDINGUNG,
		AUSGANGSDATEN, AUSWAHLOPTION, AUSGANGSPARAMETER, EINGANGSPARAMETER, IDENTIFIKATIONSPARAMETERWERT_TARIFART
    }

    private int _nextPoolKey = 0;
    private Map<POOL, Integer> _poolKeyMap = new HashMap<POOL, Integer>();
    private Map<String, Integer> _refMap = new HashMap<String, Integer>();
    private int _poolItemCounter = 0;
    private POOL _lastPool = null;

    public PoolKeyManager() {
    }

    public int nextPool(POOL pool) {
        if (_poolItemCounter == 0) {
            _nextPoolKey++;
        }
        _poolKeyMap.put(pool, _nextPoolKey);
        _poolItemCounter = 0;
        _lastPool = pool;
        return _nextPoolKey;
    }

    public void consumeItemKey(int dbRowId) {
        _refMap.put(buildRowKey(_lastPool, dbRowId), _nextPoolKey);
        _nextPoolKey++;
        _poolItemCounter++;
    }
    
    public int getCurrentPoolKey() {
    	return _poolItemCounter;
    }

    public int getXMLRefByPoolId(POOL pool, int poolId) throws Exception {

        String rowKey = buildRowKey(pool, poolId);
        if (!_refMap.containsKey(rowKey)) {
            throw new Exception(String.format("Pool id %s not yet known in PoolKeyManager", rowKey));
        }

        return _refMap.get(rowKey);

    }

    private String buildRowKey(POOL pool, int rowId) {
        return String.format("%s@%d", pool, rowId);
    }

}
