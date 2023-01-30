package home5;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) { 
        HashMap<Integer, String> passportsAndNames = new HashMap<>();  {
        
            System.out.println(
                "Задание №1\nИнициализируем словарь в котором будут храниться имена");
        System.out.println();
        }
        // 2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол

       passportsAndNames.put(212133, "Михаил Александрович Малышев, м 65"); 
       passportsAndNames.put(162348, "Иван Михайлович Серебряков м 21"); 
       passportsAndNames.put(8082771, "Дональд Джон Трамп м 65"); 
       passportsAndNames.put(16246448, "Павел Сергеевич Иванов м 27"); 
       passportsAndNames.put(8082271, "Георгий Павлович Иванов м 3");
       System.out.println(passportsAndNames); 

   } 

}

        // 3. Изменить значения сделав пол большой буквой

        public class Program {

            public static String Puzzle(String s) {
                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++)
                {
                    if (i==chars.length-1 || chars[i+1]==' ')
                        chars[i]=Character.toUpperCase(chars[i]);
                }
        
                return new String(chars);
            }
        }
        // 4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И.
        public class Program {

            public static String Puzzle(String s) {
                char[] chars = s.toCharArray();
                for (int i = 0; i < chars.length; i++)
                {
                    if (i==chars.length-1 || chars[i+1]==' ')
                        chars[i]=Character.toUpperCase(chars[i]);
                }
        
                return new String(chars);
            }
        }

