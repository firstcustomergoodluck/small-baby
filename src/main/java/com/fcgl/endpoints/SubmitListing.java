package com.fcgl.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubmitListing {

    @PostMapping("/v1/submitFeed")
    public ResponseEntity postListing() {
        //TODO: This should probably call a factory to generate a listing in a particular Vendor
        //TODO: Should we submit a feed in multiple places?
        //TODO: Should we submit different feeds on different sites?
        //TODO: Should there be different message queues for each vendor???
        return ResponseEntity.status(200).body("OK");
    }

    @GetMapping("/v1/FeedStatus")
    public ResponseEntity listingStatus() {
        //TODO: This should probably call a factory to generate a listing in a particular Vendor
        return ResponseEntity.status(200).body("OK");
    }
}