package service;
import static db.DataSource.*;


public class AdminService {

    public void service(){
        while (true){
            System.out.println("""
                    0. exit
                    1. ....
                    2. ....
                    3. ....
                    """);
            switch (intScanner.nextInt()){
                case 0 -> {}
                case 1 -> {}
                case 2 -> {}
                case 3 -> {}
            }
        }
    }
}
