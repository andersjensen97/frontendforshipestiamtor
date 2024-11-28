import React, { useState, useEffect } from 'react';

function UserList() {
  // State to hold user data and loading state
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);

  // Function to fetch data
  const fetchUsers = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/users');
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      setUsers(data); // Update the state with fetched data
    } catch (error) {
      console.error('Error fetching users:', error);
    } finally {
      setLoading(false); // Stop loading
    }
  };

  // Fetch data when the component mounts
  useEffect(() => {
    fetchUsers();
  }, []);

  // Render loading state or list of users
  if (loading) {
    return <p>Loading...</p>;
  }

  return (
    <div>
      <h1>User List</h1>
      <ul>
        {users.map(user => (
          <li key={user.id}>
            {user.name} - {user.email}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default UserList;
