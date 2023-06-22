# Strategie Start.Flach Ziel.Flach Via SoGruppe
Die Strategie wählt verbindungsbezogen eine Verkaufs-Sorte für den Warenkorb aus.
## Ablauf

1. Die (optionale) Start- und Zielortauswahl erfolgt über flache Listen (keine hierarchischen Auswahl-Bäume).
2. Wenn zu einer Start- und Zielortauswahl mehrere Verbindungen möglich sind muss der Bediener eine Via-Auswahl treffen.
3. Aus der gewählten Verbindung ergibt sich eine Liste mit Tarifarten, die mit dieser Verbindung angeboten werden können. Die Tarifartenliste schränkt die Liste der möglichen Sortengruppen ein, für die ein Verkauf auf dieser Verbindung möglich ist. Unter Berücksichtigung dieser Einschränkung wird eine Liste mit verkaufbaren Sortengruppen erstellt.
4. Auf Grundlage der Liste der verkaufbaren Sortengruppen ergibt sich eine Menge verkaufbarer (eingeschränkt durch die Tarifartenliste) Sorten. Über diesen Sorten wird eine Liste der Sortenattribute erstellt, die für die Auswahl einer Sorte aus einer Sortengruppe relevant ist.
5. In einem Dialog werden dem Bediener die Sortengruppen und die Sortenattribute zur Auswahl angeboten. Das Ergebnis der Auswahl ist genau eine Verkaufs-Sorte, für die sich der Kunde entscheidet.
6. Mit dieser Entscheidung endet die Strategie und das Vertriebssystem übernimmt die gewählte Verbindung und die Verkaufs-Sorte und legt sie in den Warenkorb.