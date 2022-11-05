package models;

public class Role {
    private int roleId; 
    private String roleName ; 

    public Role() {
    }

    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;      
    }

    public int getId() {
        return roleId;
    }

    public String getName() {
        return roleName;
    }

    public void setId(int roleId) {
        this.roleId = roleId;
    }

    public void setName(String roleName) {
        this.roleName = roleName;
    }

}
