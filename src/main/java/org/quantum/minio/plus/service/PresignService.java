package org.quantum.minio.plus.service;

import org.quantum.minio.plus.dto.MultipartUploadDTO;
import org.quantum.minio.plus.dto.ObjectDTO;
import org.quantum.minio.plus.dto.PutObjectDTO;
import org.quantum.minio.plus.dto.UploadPartDTO;
import org.quantum.minio.plus.dto.query.ObjectQuery;

/**
 * 签名服务
 * @author ike
 * @date 2021 年 05 月 09 日 17:09
 */
public interface PresignService {

    /**
     * 获取对象
     * @param query 查询
     * @return
     */
    String getObject(ObjectQuery query);

    /**
     * put 对象
     * @param dto 传输对象
     * @return
     */
    String putObject(PutObjectDTO dto);

    /**
     * 上传部分
     * @param dto 传输对象
     * @return
     */
    String uploadPart(UploadPartDTO dto);

    /**
     * 终止多部分上传
     * @param dto 传输对象
     * @return
     */
    String abortMultipartUpload(MultipartUploadDTO dto);

    /**
     * 完成多部分上传
     * @param dto 传输对象
     * @return
     */
    String completeMultipartUpload(MultipartUploadDTO dto);
}
