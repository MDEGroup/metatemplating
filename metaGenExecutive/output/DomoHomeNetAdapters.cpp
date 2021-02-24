
// Data Formatters

#include "JsonFormatter.h"
#include "XmlFormatter.h"
#include "XmiFormatter.h"

// Controller network implementation

void ECU_01networkUploader(String data);
String ECU_01networkDownloader();

void ECU_02networkUploader(String data);
String ECU_02networkDownloader();

// ***

/* Adapter for - TempSend */		
class TempSendNetAdapter {
	public:
	
	TempData* TempData_ptr;
	
	// Uplink
	void uplink () {
		// JSON
		String data = JsonBuilder(TempData_ptr);
		ECU_01networkUploader(data);
						
	}
				
};		
	
/* Adapter for - CmdRcv */		
class CmdRcvNetAdapter {
	public:
	
	CmdData* CmdData_ptr;
	
	// Downlink
	void downlink () {
		// JSON
		String data = ECU_01networkDownloader();
		JsonParser(data, CmdData_ptr);		
						
	}	
				
};		
	
/* Adapter for - CmdSend */		
class CmdSendNetAdapter {
	public:
	
	CmdData* CmdData_ptr;
	
	// Uplink
	void uplink () {
		// JSON
		String data = JsonBuilder(CmdData_ptr);
		ECU_02networkUploader(data);
						
	}
				
};		
	
/* Adapter for - TempRcv */		
class TempRcvNetAdapter {
	public:
	
	TempData* TempData_ptr;
	
	// Downlink
	void downlink () {
		// JSON
		String data = ECU_02networkDownloader();
		JsonParser(data, TempData_ptr);		
						
	}	
				
};		
	