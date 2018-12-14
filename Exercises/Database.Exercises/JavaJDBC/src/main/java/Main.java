public class Main {
    public static void main(String[] args) {
        DB db = new DB();
//        db.addPerson("KuDrka" ,"KukFla","2013-11-23","123kukFli");
//        db.addPerson("KuDsrka" ,"KukFlax","2013-11-23","12ss3kukFli");
//        Person persi = new Person("Nevad" ,"Kukx","2013-11-23","12sdasds3kukFli");
//        db.addPersboWithPreparedStatemant(persi);


//
//       db.showPersoMetaData();
//        db.showAllPerson();
//
//
//        db.getAllPersonList();

        for (int i = 0; i <= db.getAllPersonList().size(); i++){
            System.out.println(db.getAllPersonList().get(i));
        }


//        db.deletePerseonByID("12sdasds3kukFli");


    }
}
