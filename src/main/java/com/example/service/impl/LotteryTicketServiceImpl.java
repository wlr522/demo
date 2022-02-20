package com.example.service.impl;

import com.example.service.LotteryTicketService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class LotteryTicketServiceImpl  implements LotteryTicketService {
    @Override
    public void shuangseqiu()  {

        Document doc= null;
        try {
            doc = Jsoup.parse(new URL("http://www.cwl.gov.cn/ygkj/kjgg/"),(100));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(doc.toString());
    }

}
