package Assignment;

import org.apache.kafka.common.protocol.types.Field;

public class MessageFromUser {

    int user_id, user_age;
    String user_name, user_course;
    public MessageFromUser(int id, String name, int age, String course) {

        this.user_id = id;
        this.user_name = name;
        this.user_age = age;
        this.user_course = course;

    }

    public String toString() {

        return ("\"Id\":"+"\""+Integer.toString(user_id)+"\","+"\"Name\":"+"\""+user_name+"\","+"\"Age\":"+"\""+Integer.toString(user_age)+"\","+"\"Course\":"+"\""+user_course+"\"");
    }

}