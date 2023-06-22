# HuSSt2PKM Converter ReadMe

## Installation

### Prerequisites

The following tools are required to compile and package the HuSSt2PKM converter

- Java 11+ JDK
- Maven 3.8+

### Build

Enter the following command to compile and package the converter

	mvn clean package
	
You will then find the `husst2pkm.jar` in the `\target` directory.

## Usage

	java -jar husst2pkm.jar -h <HuSSt db3 database> -p <path for pkm files>

## Example

Example if the HuSSt database husst_tariff.db3 and the pkm target path are the same

	java -jar husst2pkm.jar -h .\husst_tariff.db3 -p .\
	
## Help

	java -jar husst2pkm.jar -help



