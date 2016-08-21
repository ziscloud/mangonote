package com.caiyunworks.mangonote.entity;


import com.couchbase.client.java.repository.annotation.Field;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

/**
 * Created by Tony Wang on 8/20/16.
 */
@Document
@Data
public class Book {
    @Id
    private long bookId;
    @Field
    private String name;
    @Field
    private long isbnNumber;
}
