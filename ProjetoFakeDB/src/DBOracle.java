
public class DBOracle implements InterfaceDB{

	@Override
	public void conectar() {
		System.out.println("Connecting on Oracle DataBase");			
	}

	@Override
	public void desconectar() {
		System.out.println("Disconnecting from Oracle DataBase");	
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("oracle> " + comando);
	}
	
}
