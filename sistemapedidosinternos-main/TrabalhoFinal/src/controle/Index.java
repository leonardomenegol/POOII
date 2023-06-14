package controle;

import visao.SistPedidosInt;

public class Index {

	public static void main(String[] args) {

		SistPedidosInt sistPI = new SistPedidosInt();
		sistPI.setVisible(true);

		UsuarioControle usControle = new UsuarioControle(sistPI);
	}

}
