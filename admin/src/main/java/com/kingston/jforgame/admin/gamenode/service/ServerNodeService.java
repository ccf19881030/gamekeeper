package com.kingston.jforgame.admin.gamenode.service;

import com.kingston.jforgame.admin.domain.ServerInfo;
import com.kingston.jforgame.admin.gamenode.dao.ServerInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerNodeService {
    
	@Autowired
    private ServerInfoDao serverInfoDao;

    public List<ServerInfo> getServerNodeList(Integer page, Integer count) {
        return serverInfoDao.findAll();
    }

    public int getServerNodeSum() {
        return (int) serverInfoDao.count();
    }

    public ServerInfo getServerNodeBy(Integer id) {
       return serverInfoDao.findOne(id);
    }

}
