package homework5GameManagerDay4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements NewGamerCheckService {

	public boolean CheckIfRealPerson(NewGamerMember newGamerMember) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(newGamerMember.getNationalityId()),
					newGamerMember.firstName.toUpperCase(), newGamerMember.lastName.toUpperCase(), newGamerMember.age);
		} catch (RemoteException e) {
			return false;

		}

	}

}
