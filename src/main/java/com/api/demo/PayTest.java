package com.api.demo;
@SuppressWarnings("all")
public class PayTest {
public static void main(String[] args) {
	HttpClient_Pay  paytest = new HttpClient_Pay();
//	paytest.Notice();          //测试补通知
	paytest.orderCreate();         //创建订单
//	paytest.orderQuery();            //订单查询
//	paytest.QueryZZ();              //转账查询 
//	paytest.OutQueryCreate();      // 创建转账
//	paytest.queryYE();
}
}
