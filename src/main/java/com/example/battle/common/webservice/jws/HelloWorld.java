package com.example.battle.common.webservice.jws;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author guowei
 *
 */
@WebService
public interface HelloWorld {
  String sayHi(@WebParam(name="text") String text);
  String sayHiToUser(@WebParam(name="user") User user);
}