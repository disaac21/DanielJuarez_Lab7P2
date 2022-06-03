package danieljuarez_lab7p2;

public class Usuario {
    
    public String Username;
    public String Password;
    public int Edad;

    public Usuario() {
    }

    public Usuario(String Username, String Password, int Edad) {
        this.Username = Username;
        this.Password = Password;
        this.Edad = Edad;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Usuario: " + Username;
    }
    
}
