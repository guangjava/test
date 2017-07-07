package com.wanlianjin.oc.nvhl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**抽象组件类
 *@comment  
 *@author denghao
 *@date 2016年4月25日 下午1:48:38
 *@version 1.0.0
 *@see
	*/
public class AbstractPolicy implements Serializable {

	private static final long serialVersionUID = -6288547335393366871L;


    /**
     * 要素分类Map 结构为<Map<List<Map<要素名,值>> composition(Map of component)
     * component(List of entry) entry(VO) element(VO property)
     */
    private Map<String, List<Object>> composition = new HashMap<String, List<Object>>();
    

    /**
     * 获得组件Map
     *
     * @return
     */
    public Map<String, List<Object>> getComposition() {
        return this.composition;
    }

    /**
     * 设置组件Map
     *
     * @param composition
     */
    public void setComposition(Map<String, List<Object>> composition) {
        this.composition = composition;
    }

    /**
     * 获得组件列表
     *
     * @return
     */
    public Collection<List<Object>> getComponentCollection() {
        return this.composition.values();
    }

    /**
     * 获得组件名称集合
     *
     * @return
     */
    public Set<String> getComponentNameSet() {
        return this.composition.keySet();
    }

    /**是否含有组件
     * @param componentName
     * @return
     */
    public boolean containsComponent(String componentName) {
        return this.getComponentNameSet().contains(componentName);
    }

    /**
     * 获得组件(List<Vo>)
     *
     * @param componentName
     * @return
     */
    public List getComponent(String componentName) {
        return this.composition.get(componentName);
    }

    /**
     * 设置组件
     *
     * @param componentName
     * @param component
     */
    public void putComponent(String componentName, List component) {
        this.composition.put(componentName, component);
    }

    /**
     * 去除组件
     *
     * @param componentName
     */
    public void removeComponent(String componentName) {
        this.composition.remove(componentName);
    }

    /**
     * 获得单记录组件VO
     *
     * @param componentName
     * @return
     */
    public Object getMonoComponent(String componentName) {
        List dataList = this.composition.get(componentName);
        if (dataList!=null && dataList.size()>0) {
            return dataList.get(0);
        } else {
            return null;
        }
    }

    /**
     * 设置单记录组件
     *
     * @param componentName
     * @param entry
     */
    public void putMonoComponent(String componentName, Object entry) {
        List component = new ArrayList();
        component.add(entry);
        this.composition.put(componentName, component);
    }



}
