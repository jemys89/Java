package org.foobarspam.furnaceDIP.interfaces;

import org.foobarspam.furnaceDIP.types.RegulatorDisplayCodes;

public interface Regulate {
	
	void regulate();
	void message(RegulatorDisplayCodes code);
}
