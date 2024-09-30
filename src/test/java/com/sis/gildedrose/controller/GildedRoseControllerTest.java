package com.sis.gildedrose.controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
class GildedRoseControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new GildedRoseController()).build();
    }

    @Test
    void updateInventory_should_return_201() throws Exception {

        mockMvc.perform(post("/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("[\n" +
                                "  {\n" +
                                "    \"name\": \"Aged Brie\",\n" +
                                "    \"sellIn\": \"1\",\n" +
                                "    \"quality\": \"1\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Backstage passes\",\n" +
                                "    \"sellIn\": \"-1\",\n" +
                                "    \"quality\": \"2\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Backstage passes\",\n" +
                                "    \"sellIn\": \"9\",\n" +
                                "    \"quality\": \"2\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Sulfuras\",\n" +
                                "    \"sellIn\": \"2\",\n" +
                                "    \"quality\": \"2\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Normal Item\",\n" +
                                "    \"sellIn\": \"-1\",\n" +
                                "    \"quality\": \"55\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Normal Item\",\n" +
                                "    \"sellIn\": \"2\",\n" +
                                "    \"quality\": \"2\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"INVALID ITEM\",\n" +
                                "    \"sellIn\": \"2\",\n" +
                                "    \"quality\": \"2\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Conjured\",\n" +
                                "    \"sellIn\": \"2\",\n" +
                                "    \"quality\": \"2\"\n" +
                                "  },\n" +
                                "  {\n" +
                                "    \"name\": \"Conjured\",\n" +
                                "    \"sellIn\": \"-1\",\n" +
                                "    \"quality\": \"5\"\n" +
                                "  }\n" +
                                "]")
                        .characterEncoding("utf-8"))
                .andExpect(status().is(201));
    }


    @Test
    void updateInventory_should_return_400_for_an_empty_payload() throws Exception {

        mockMvc.perform(post("/update")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("")
                        .characterEncoding("utf-8"))
                .andExpect(status().is(400));
    }


}