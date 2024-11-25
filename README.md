# QAP 2 - Golf Club Management

## Docker Container

This project is designed to run inside a docker container. You can either build the image from this repository
locally or download an image file from <https://hub.docker.com/r/sweetboymusik/golf_club_management>.

To build locally, follow these steps:

1. Ensure you have MySQL installed on your local system.
2. Create a MySQL DB called ``golf_club_management``
3. Ensure you have Docker installed on your local system.
4. Ensure you have Maven installed on your local system.
5. Clone this repository.
6. Within the repository directory, run the following command to package the project: <br>
   ``mvn package``
7. In that same directory, run the following command to build the docker image: <br>
   ``docker build -t <image-name> .``
8. Run one the following commands to start up your newly created docker image: <br>
   ``docker compose up`` or  ``docker run <image-name>``

After that, you're ready to start using the API! All requests should be made to http://localhost:8080/.

## API End Points

### Members

POST Requests

1. ``/member/add``
    - Adds a member to the database.
    - The following JSON fields must be present in the request body:

      ```json
      {
        "firstName": "Jane",
        "lastName": "Doe",
        "address": "1 Main Street, City, State/Province ZIP/POSTAL",
        "email": "janedoe@example.com",
        "phoneNumber": "1-555-555-5555",
        "membershipStartDate": "YYYY-MM-DD",
        "membershipDurationInMonths": 6
      }
      ```

GET Requests

1. ``/member/all``
    - Returns **all** members.

   &nbsp;
2. ``/member/id/{id}``
    - Returns the member with the specified id.
    - ``{id}`` should be a valid ``integer`` value.

   &nbsp;
3. ``/member/first_name/{first_name}``
    - Returns **all** members with the specified first name.
    - ``{first_name}`` should be a valid ``string`` value.

   &nbsp;
4. ``/member/last_name/{last_name}``
    - Returns **all** members with the specified last name.
    - ``{last_name}`` should be a valid ``string`` value.

   &nbsp;
5. ``/member/full_name/{first_name}/{last_name}``
    - Returns **the first** member with the specified first name and last name.
    - ``{first_name}`` and ``{last_name}`` should be a valid ``string`` values.

   &nbsp;
6. ``/member/email/{email}``
    - Returns member with the specified email address.
    - ``{email}`` should be a valid ``string`` value.

   &nbsp;
7. ``/member/phone_number/{phone_number}``
    - Returns member with the specified phone number.
    - ``{phone_number}`` should be a valid ``string`` value.

   &nbsp;
8. ``/member/membership_duration/{duration}``
    - Returns **all** members with the specified membership duration in months.
    - ``{membership_duration}`` should be a valid ``integer`` value.

---

### Tournaments

POST Requests

1. ``/tournament/add``
    - Adds a tournament to the database.
    - The following JSON fields must be present in the request body:

      ```json
      {
        "startDate": "YYYY-MM-DD",
        "endDate": "YYYY-MM-DD",
        "location": "Location, City",
        "entryFee": 50.00,
        "prizeAmount": 10000.00
      }
      ```

2. ``/tournament/{tournament_id}/members/add/{member_id}``
    - Adds a member to the specified tournament.
    - ``{tournament_id}`` and ``{member_id}`` must be a valid ``integers``.

GET Requests

1. ``/tournament/all``
    - Returns **all** tournaments.

   &nbsp;
2. ``/tournament/id/{id}``
    - Returns the tournament with the specified ID.
    - ``{id}`` should be a valid ``integer`` value.

   &nbsp;
3. ``/tournament/start_date/{start_date}``
    - Returns the tournament with the specified start date.
    - ``{start_date}`` should be a valid ``string`` value, with a YYYY-MM-DD format.

   &nbsp;
4. ``/tournament/end_date/{end_date}``
    - Returns the tournament with the specified end date.
    - ``{end_date}`` should be a valid ``string`` value, with a YYYY-MM-DD format.

   &nbsp;
5. ``/tournament/id/{id}/members``
    - Returns **all** participating members of the tournament with the specified ID.
    - ``{di}`` should be a valid ``integer`` value.