package com.cn.china.others;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.web.context.request.async.DeferredResult;

public class DeferredResultQueue {
	
	private static Queue<DeferredResult<Object>> queue=new ConcurrentLinkedDeque<DeferredResult<Object>>();
	
	public static void save(DeferredResult<Object> object){
		queue.add(object);
		
	}
	
	public static DeferredResult<Object> get(){		
		return queue.poll();
	}

}
