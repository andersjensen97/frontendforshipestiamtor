from twilio.rest import Client

# Your Twilio account SID and Auth Token
account_sid = 'AC1658645619d5440b396f763ea0b3d876'
auth_token = '0422b89bc5431fb48cbd76655897b4c7'

client = Client(account_sid, auth_token)

# List of phone numbers to send the SMS
phone_numbers = ['+4553607550']

message_body = "Hello, this is a test message."

for number in phone_numbers:
    message = client.messages.create(
        body=message_body,
        from_='+16562163711',
        to=number
    )

    print(f"Message sent to {number}")