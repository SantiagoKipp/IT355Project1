public class tsm03{
    /**
     * Private constructor to initialize a student object.
     */
    private tsm03(String name, int uid){
        this.name = name;
        this.uid = uid;
    }
    /**
     * Synchronized factory method to ensure thread-safe initialization and access.
     * 
     * @param value The integer value to initialize the object.
     * @return safely initialized object
     */
    public static synchronized Student getInstance(String name,int uid) {
        // Check if the instance is null, and only then create a new one
        if (instance == null || uid == null) {
            instance = new tsm03(name, uid);
        }
        return instance;
    }

    public int getUid(){
        return uid;
    }
    public String getName(){
        return name;
    }
    
    public void main(String args[]){
        tsm03 student1 = tsm03.getInstance(1);

        System.out.println("Student1 Name : " + student1.getName() + " UID:" + student1.getUid());
    }
}