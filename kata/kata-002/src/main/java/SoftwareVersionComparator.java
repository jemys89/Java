import java.security.SecureRandom;
import java.util.Comparator;

public class SoftwareVersionComparator implements Comparator<String> {

    /**
     * Compares two software version strings. Software versions are made of
     * a maximum of 5 integers separated by dots. For example these are all
     * allowed version numbers:
     *
     * <ul>
     *     <li>3</li>
     *     <li>1.9.2</li>
     *     <li>3.0.678.34.9</li>
     * </ul>
     *
     * @param version1 first version String
     * @param version2 second version String
     * @return a negative integer if version1 is smaller than version2,
     *         zero if version1 equals version2, a positive integer
     *         if version1 is greater than version 2
     */
    @Override
    public int compare(String version1, String version2) {
//    	double versionNumerica1 = Double.parseDouble(version1);
//    	double versionNumerica2 = Double.parseDouble(version2);
//    	
//    	double sumaDosVersion = versionNumerica1 + versionNumerica2;
//    	
//    	if(version1.equalsIgnoreCase(version2)){
//    		return 0;
//    	}else if( versionNumerica1 < versionNumerica2){
//    		return -1;
//    	}else if(versionNumerica1 > versionNumerica2){
//    		return 1;
//    	}
    	int comparador = 0;
    	char punto = 46;
    	for(int i = 0; i < version1.length(); i++){
    		if(version1.charAt(i) == punto && version2.charAt(i) == punto){
    			continue;
    		}
    		if(version1.charAt(i) < version2.charAt(i)){
    			comparador = -1;
    			break;
    		}else if(version1.charAt(i) > version2.charAt(i)){
    			comparador = 1;
    			break;
    		}else{
    			comparador =0;
    		}
    		
    	}
    	return comparador;
    	
    }

}
