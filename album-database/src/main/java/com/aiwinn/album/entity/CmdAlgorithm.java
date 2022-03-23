package com.aiwinn.album.entity;

import java.io.Serializable;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@TableName("t_cmd_algorithm")
public class CmdAlgorithm implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@TableId(type = IdType.AUTO)
	private Long id;
	private String name;
	private String type;
	private String version;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	private String createBy;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date lastModifyTime;
	private String lastModifyBy;
}
