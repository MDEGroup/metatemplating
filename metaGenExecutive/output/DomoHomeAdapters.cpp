
#include "Wire.h"
#include "I2C.h"
#include "SPI.h"

// Static code - Pin access Interface

void writeAnalog(int pin, int value);
int readAnalog(int pin);
void writeDigital(int pin, bool value);
bool readDigital(int pin);

// ***

/* Reading Adapter - TempSens */
class TempSensAdapter {
	public:
				
		Wire* DhtBus;
							
		const int DhtBus_dht_data = 3;
		
	void run() {
		
		DhtBus->read();
	}

};	

/* Reading Adapter - KeypadInterface */
class KeypadInterfaceAdapter {
	public:
							
		bool btn_1;
							
		bool btn_2;
							
		bool btn_3;
							
		bool btn_4;
		
	void run() {
		
		btn_1 = readDigital(2);
	
		btn_2 = readDigital(3);
	
		btn_3 = readDigital(4);
	
		btn_4 = readDigital(5);
	
	}

};	

/* Writing Adapter - RelayDriver */
class RelayDriverAdapter {
	public:
		
		bool heater_cmd;
		
	void run() {
		
		writeDigital(2, heater_cmd);
	
	}

};

/* Writing Adapter - DisplayInterface */
class DisplayInterfaceAdapter {
	public:
				
		I2C* ExternalBus;
							
		const int ExternalBus_i2c_sda = 6;
							
		const int ExternalBus_i2c_scl = 7;
		
	void run() {
		
		ExternalBus->write();
	}

};