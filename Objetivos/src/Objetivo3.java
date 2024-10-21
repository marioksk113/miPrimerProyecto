public class Objetivo3 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Escribe el número hasta donde quires contar");
	
        Scanner scanner = new Scanner(System.in);
        int contar = scanner.nextInt();
        
        for(int cont=1; cont<=contar; cont++) {
                
                System.out.print(cont + " ");
            }
                System.out.println("");
    }
}
