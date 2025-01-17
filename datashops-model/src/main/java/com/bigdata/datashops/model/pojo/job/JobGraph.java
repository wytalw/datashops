package com.bigdata.datashops.model.pojo.job;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.bigdata.datashops.model.pojo.BaseModel;
import com.bigdata.datashops.model.vo.VoJobNode;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "t_job_graph")
public class JobGraph extends BaseModel {
    private String maskId;

    private String name;
    /**
     * 作业描述
     */
    private String description;

    private String configJson;

    /**
     * 0已删除，1存在
     */
    private Integer status;

    /**
     * 调度周期
     */
    private Integer schedulingPeriod;

    private String cronExpression;

    /**
     * 下次调度时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date nextTriggerTime;

    /**
     * 0 关闭调度，1 开启调度
     */
    private int schedulerStatus;

    private Integer projectId;

    private String owner;

    private Integer notifyType;

    private Integer priority;

    private String emails;

    private String phones;

    private Integer baseTimeType;

    private Integer offset;

    private Integer timeout;

    private Integer retry;

    private Integer retryTimes;

    private Integer retryInterval;

    private Integer hostSelector;

    @Transient
    private List<VoJobNode> nodeList;

    @Transient
    private List<Edge> lineList;

}
