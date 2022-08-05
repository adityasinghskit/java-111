package com.masai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="pb")
public class PresentationBean {
@Autowired
private ServiceBean sb;
@Autowired
private int a;
@Autowired
private int b;
public void cal() {
System.out.println("The sum is:"+sb.sum(a, b));
System.out.println("The diff is:"+sb.diff(a, b));
System.out.println("The multiplication is:"+sb.mul(a, b));
System.out.println("The division is:"+sb.div(a, b));
}
}
