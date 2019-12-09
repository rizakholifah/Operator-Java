public class operator5{
    public static void main(String[] args){
        boolean hujan = true;
        boolean tidakHujan = false;

        System.out.println(tidakHujan == true?"Bawa payung":"Tidak Usah Bawa Payung");

        String nama = "Riza";
        String access = nama == "Riza" ? "Welcome Mr Riza" : "Access Denied !";

        System.out.println(access);

        String password = "secret";
        boolean loggedIn = password == "secret" ? true:false;

        System.out.println(loggedIn);

    }
}