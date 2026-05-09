class Admin extends User {
    private final String adminPassword = "password123"; // Simple password for now

    public Admin(int id) {
        super(id);
    }

    public boolean checkPassword(String input) {
        return adminPassword.equals(input);
    }
}