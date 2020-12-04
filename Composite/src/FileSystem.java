public class FileSystem {
    public static void main(String[] args) throws Exception {
        Folder f1 = new Folder("Universidad:");
        Folder f2 = new Folder("Sistemas 3:");
        Folder f3 = new Folder("Libros:");

        File file1 = new File("Programa Lic. Sistemas de Información" ,"programa.pdf");
        File file2 = new File("Cronograma" ,"cronograma.xls");
        File file3 = new File("Programa Sistemas 3" ,"programa.pdf");
        File file4 = new File("Antipatterns" ,"antipatterns.pdf");
        File file5 = new File("Patrones de diseño" ,"patrones.pdf");

        f1.addFileComponent(file1);
        f1.addFileComponent(file2);
        f1.addFileComponent(f2);
        f2.addFileComponent(file3);
        f2.addFileComponent(f3);
        f3.addFileComponent(file4);
        f3.addFileComponent(file5);

        f1.display(" ");
    }
}
