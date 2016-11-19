package org.ksoong.weibo4j.examples.statuses;

import java.io.IOException;

import org.ksoong.weibo4j.Statuses;
import org.ksoong.weibo4j.examples.Token;

public class ExampleOfMentions {

    public static void main(String[] args) throws IOException {

        Statuses statuses = new Statuses(Token.TOKEN);
        System.out.println(statuses.mentions());
        System.out.println(statuses.mentions_ids());
    }

}
