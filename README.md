# API

## End Points

### Members

POST Requests

1. ``/member/add``
    - Adds a member to the database.
   > The following JSON fields must be present in the request body:

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
   > Returns all members.

2. ``/member/id/{id}``
    - Returns the member with the specified id.
    - ``{id}`` should be a valid ``integer`` value.
3. ``/member/first_name/{first_name}``
    - Returns **all** members with the specified first name.
    - ``{first_name}`` should be a valid ``string`` value.
4. ``/member/last_name/{last_name}``
    - Returns **all** members with the specified last name.
    - ``{last_name}`` should be a valid ``string`` value.
5. ``/member/full_name/{first_name}/{last_name}``
    - Returns **the first** member with the specified first name and last name.
    - ``{first_name}`` and ``{last_name}`` should be a valid ``string`` values.
6. ``/member/email/{email}``
    - Returns member with the specified email address.
    - ``{email}`` should be a valid ``string`` value.
7. ``/member/phone_number/{phone_number}``
    - Returns member with the specified phone number.
    - ``{phone_number}`` should be a valid ``string`` value.
8. ``/member/membership_duration/{duration}``

---

### Tournaments

POST Requests

1. ``/tournament/add``
    - Adds a tournament to the database.
   > The following JSON fields must be present in the request body:

```json
{
  "startDate": "2024-01-01",
  "endDate": "2023-02-01",
  "location": "Memorial Club, City",
  "entryFee": 50.00,
  "prizeAmount": 10000.00
}
```

2. ``/tournament/{tournament_id}/members/add/{member_id}``

GET Requests

1. ``/tournament/all``
2. ``/tournament/id/{id}``
3. ``/tournament/start_date/{start_date}``
4. ``/tournament/end_date/{end_date}``
5. ``/tournament/id/{id}/members``