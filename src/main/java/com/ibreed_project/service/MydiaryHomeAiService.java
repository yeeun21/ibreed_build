/*
 * package com.ibreed_project.service;
 * 
 * import java.io.ByteArrayInputStream; import java.io.File;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.amazonaws.SdkClientException; import
 * com.amazonaws.auth.AWSStaticCredentialsProvider; import
 * com.amazonaws.auth.BasicAWSCredentials; import
 * com.amazonaws.client.builder.AwsClientBuilder; import
 * com.amazonaws.services.s3.AmazonS3; import
 * com.amazonaws.services.s3.AmazonS3ClientBuilder; import
 * com.amazonaws.services.s3.model.AmazonS3Exception; import
 * com.amazonaws.services.s3.model.ObjectMetadata; import
 * com.amazonaws.services.s3.model.PutObjectRequest;
 * 
 * 
 * @Service public class MydiaryHomeAiService {
 * 
 * public static void main(String[] args) {
 * 
 * final String endPoint = "https://kr.object.ncloudstorage.com"; final String
 * regionName = "kr-standard"; final String accessKey = "ACCESS_KEY"; final
 * String secretKey = "SECRET_KEY";
 * 
 * // S3 client final AmazonS3 s3 = AmazonS3ClientBuilder.standard()
 * .withEndpointConfiguration(new
 * AwsClientBuilder.EndpointConfiguration(endPoint, regionName))
 * .withCredentials(new AWSStaticCredentialsProvider(new
 * BasicAWSCredentials(accessKey, secretKey))) .build();
 * 
 * String bucketName = "sample-bucket";
 * 
 * // create folder String folderName = "sample-folder/";
 * 
 * ObjectMetadata objectMetadata = new ObjectMetadata();
 * objectMetadata.setContentLength(0L);
 * objectMetadata.setContentType("application/x-directory"); PutObjectRequest
 * putObjectRequest = new PutObjectRequest(bucketName, folderName, new
 * ByteArrayInputStream(new byte[0]), objectMetadata);
 * 
 * try { s3.putObject(putObjectRequest);
 * System.out.format("Folder %s has been created.\n", folderName); } catch
 * (AmazonS3Exception e) { e.printStackTrace(); } catch(SdkClientException e) {
 * e.printStackTrace(); }
 * 
 * // upload local file String objectName = "sample-object"; String filePath =
 * "/tmp/sample.txt";
 * 
 * try { s3.putObject(bucketName, objectName, new File(filePath));
 * System.out.format("Object %s has been created.\n", objectName); } catch
 * (AmazonS3Exception e) { e.printStackTrace(); } catch(SdkClientException e) {
 * e.printStackTrace(); }
 * 
 * }
 * 
 * }
 */