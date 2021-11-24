package test.HomeWork6;

public class Singleton {
        private static Singleton instance; // "инстанс" который возвращается на запрос чего либо

        public static Singleton getInstance(){
            if(instance == null){
                instance = new Singleton();
            }
            return instance;
        }

        private Singleton(){

        }
    }
