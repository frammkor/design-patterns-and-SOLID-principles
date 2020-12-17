package com.coffeepoweredcrew.interpreter;

//Terminal expression
public class Permission implements PermissionExpression {
    // is going to represent that single rule present on the Report class

    private String permission;

    public Permission (String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpret (User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }

}
