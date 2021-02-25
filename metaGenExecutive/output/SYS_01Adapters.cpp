



#include "Wire.h"
#include "I2C.h"
#include "SPI.h"
	
#include "JsonFormatter.h"
#include "XmlConnector.h"
	




// Static code - Pin access Interface

void writeAnalog(int pin, int value);
int readAnalog(int pin);
void writeDigital(int pin, bool value);
bool readDigital(int pin);

// ***





/* Reading Adapter - TempSens */
class TempSensReadingAdapter {
	public:
		
		
		
				
		Wire* DhtBus;
							
		const int DhtBus_dht_data = 3;
		
		
	void run() {
		
		
		
		DhtBus->read();
	}

};	

/* Reading Adapter - KeypadInterface */
class KeypadInterfaceReadingAdapter {
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



/* Reading Adapter - CmdRcv */
class CmdRcvReadingAdapter {
	public:
		
		
		
				
		JsonFormatter* WifiSerial;
							
		const int WifiSerial_uart_tx = 0;
							
		const int WifiSerial_uart_rx = 1;
		
		
	void run() {
		
		
		
		WifiSerial->read();
	}

};	

/* Reading Adapter - TempRcv */
class TempRcvReadingAdapter {
	public:
		
		
		
				
		JsonFormatter* WifiSerial;
							
		const int WifiSerial_uart_tx = 0;
							
		const int WifiSerial_uart_rx = 1;
		
		
	void run() {
		
		
		
		WifiSerial->read();
	}

};	





/* Writing Adapter - RelayDriver */
class RelayDriverWritingAdapter {
	public:
		
		
		
		bool heater_cmd;
		
	void run() {
		
		
		
		writeDigital(2, heater_cmd);
	
	}

};

/* Writing Adapter - DisplayInterface */
class DisplayInterfaceWritingAdapter {
	public:
		
		
		
				
		I2C* ExternalBus;
							
		const int ExternalBus_i2c_sda = 6;
							
		const int ExternalBus_i2c_scl = 7;
		
	void run() {
		
		
		
		ExternalBus->write();
	}

};



/* Writing Adapter - TempSend */
class TempSendWritingAdapter {
	public:
		
		
		
				
		JsonFormatter* WifiSerial;
							
		const int WifiSerial_uart_tx = 0;
							
		const int WifiSerial_uart_rx = 1;
		
	void run() {
		
		
		
		WifiSerial->write();
	}

};

/* Writing Adapter - CmdSend */
class CmdSendWritingAdapter {
	public:
		
		
		
				
		JsonFormatter* WifiSerial;
							
		const int WifiSerial_uart_tx = 0;
							
		const int WifiSerial_uart_rx = 1;
		
	void run() {
		
		
		
		WifiSerial->write();
	}

};
