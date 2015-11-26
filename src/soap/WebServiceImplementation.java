package soap;

import javax.jws.WebService;

/**
 * Implementa os servi�os de nosso WebService.
 * 
 * @author Vladwoguer Bezerra
 *
 */
@WebService
public class WebServiceImplementation implements WebServiceInterface {

	@Override
	public String contaCaracteres(String texto) {
		return "Numero de carcteres:" + texto.length();
	}

}
