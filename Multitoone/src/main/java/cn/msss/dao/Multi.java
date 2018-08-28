package cn.msss.dao;

import cn.msss.entity.Provincials;

import java.io.Serializable;
import java.util.List;

public interface Multi {

   //多对一
   public List<Provincials> multi(Serializable multi);
}
