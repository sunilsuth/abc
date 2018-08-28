import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MStudent {

           public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));
            String str;
            ArrayList<student.Stud> li = new ArrayList();
            while((str=br.readLine())!=null){

                String[] x= str.split(",");
                li.add(new student.Stud(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

            }

            for(student.Stud list : li){
                System.out.println("Id:"+list.id+" ,Name:"+list.name+" ,Marks:"+list.mark);
            }
        }
    }

