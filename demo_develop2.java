class Demo {
    public static void main(String[] args){
        System.out.println("Hello");
    }

    private void setAge(int age){
        System.out.println("Age");
    }

    public void setDepartment(){
        System.out.println("setDepartment");
    }

    private void setName(){
        System.out.println("TestName");
    }

    public void addCommand(){
        System.out.println("Method Created in refactoring/feature_develop1");
    }

    public void addCommand_develop(){
        System.out.println("Method Created in refactoring/feature_develop2");
    }
}