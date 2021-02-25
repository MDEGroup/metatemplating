



class ECU_01Startup {
	private:
	
	
	
	
	void startupDhtBus() {
	
					
		// Bi-directional Pin dht_data #3 not initialized!
					
		
	
									
	}
	void startupRelayCommand() {
	
		pinMode(2, OUTPUT); // heater_cmd
					
					
		
	
									
	}
	void startupWifiSerial() {
	
		pinMode(0, OUTPUT); // uart_tx
					
					
		
		pinMode(1, INPUT); // uart_rx
					
					
		
	
									
	}
	
	
	public:
	
	
	
	
	void run() {	
		startupDhtBus();
		startupRelayCommand();
		startupWifiSerial();
	}
	
};

class ECU_02Startup {
	private:
	
	
	
	
	void startupKeypadPort() {
	
		pinMode(2, INPUT); // btn_1
					
					
		
		pinMode(3, INPUT); // btn_2
					
					
		
		pinMode(4, INPUT); // btn_3
					
					
		
		pinMode(5, INPUT); // btn_4
					
					
		
	
									
	}
	void startupExternalBus() {
	
					
		// Bi-directional Pin i2c_sda #6 not initialized!
					
		
		pinMode(7, OUTPUT); // i2c_scl
					
					
		
	
									
	}
	void startupWifiSerial() {
	
		pinMode(0, OUTPUT); // uart_tx
					
					
		
		pinMode(1, INPUT); // uart_rx
					
					
		
	
									
	}
	
	
	public:
	
	
	
	
	void run() {	
		startupKeypadPort();
		startupExternalBus();
		startupWifiSerial();
	}
	
};

