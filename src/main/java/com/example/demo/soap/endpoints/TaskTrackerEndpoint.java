package com.example.demo.soap.endpoints;

import com.example.demo.soap.ws.GetAllTaskResponse;
import com.example.demo.soap.ws.GetAllTasksRequest;
import com.example.demo.soap.ws.TaskInfo;
import com.example.demo.soap.ws.TaskList;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Arrays;

@Endpoint
public class TaskTrackerEndpoint {

    private  static final String NAMESPACE ="http://www.soap.demo.example.com/ws";

    @PayloadRoot( namespace = NAMESPACE, localPart = "getAllTasksRequest")
    @ResponsePayload
    public GetAllTaskResponse getAllTask( @RequestPayload GetAllTasksRequest request) {
        GetAllTaskResponse response = new GetAllTaskResponse();
        TaskList taskList = new TaskList();


        response.setTaskList( taskList );


        response.setServiceStatus(200);

        return response;
    }

}
