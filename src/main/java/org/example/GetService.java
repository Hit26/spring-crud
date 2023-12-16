package org.example;

import org.springframework.stereotype.Service;

@Service  //@Service Annotation to indicate that a class belongs to that layer.
public class GetService {
    public String getDetails() {
        return "detailFromService";
    }
}
