import React, { Component } from 'react';
import Post from './Post'; // adjust if Post is in Components/

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = { posts: [], hasError: false };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(data => this.setState({ posts: data }))
      .catch(err => {
        console.error(err);
        this.setState({ hasError: true });
      });
  };

  componentDidMount() { this.loadPosts(); }

  componentDidCatch(error) {
    alert('Something went wrong: ' + error);
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) return <h2>Error loading posts.</h2>;

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.slice(0, 5).map(p => (
          <Post key={p.id} title={p.title} body={p.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
