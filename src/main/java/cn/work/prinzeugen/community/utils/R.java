package cn.work.prinzeugen.community.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author prinzeugen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private int code = 0;
    private String msg;
    private Object data;

}
