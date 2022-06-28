/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.domains.v1alpha2.samples;

// [START domains_v1alpha2_generated_domainsclient_listregistrations_sync]
import com.google.cloud.domains.v1alpha2.DomainsClient;
import com.google.cloud.domains.v1alpha2.ListRegistrationsRequest;
import com.google.cloud.domains.v1alpha2.LocationName;
import com.google.cloud.domains.v1alpha2.Registration;

public class SyncListRegistrations {

  public static void main(String[] args) throws Exception {
    syncListRegistrations();
  }

  public static void syncListRegistrations() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DomainsClient domainsClient = DomainsClient.create()) {
      ListRegistrationsRequest request =
          ListRegistrationsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      for (Registration element : domainsClient.listRegistrations(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END domains_v1alpha2_generated_domainsclient_listregistrations_sync]