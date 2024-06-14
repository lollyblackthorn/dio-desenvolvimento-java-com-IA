public class SistemaMedida {
    public static void main(String[] args) {// Modo condicional if/else
        String sigla = "M";

		if("P".equals(sigla))
			System.out.println("PEQUENO");
		else if("M".equals(sigla))
			System.out.println("MÉDIO");
		else if(!"G".equals(sigla))
                    System.out.println("INDEFINIDO");
		else
                    System.out.println("GRANDE");
    }
}
