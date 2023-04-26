
public class SistemaCanil {
	public static void main(String[] args) {
		InterfaceDB idb;
//		idb = new DBMySQL();
		idb = new DBOracle();
		idb.conectar();
		idb.executarComando("SELECT * from TBL_caes");
		idb.desconectar();
	}
}
